@CustomersToTargetList
#// Tworzenie i weryfikacja przepływu pracy Klienci do listy docelowej
Feature: Create and verify workflow Customers to target list

@create
#//Tworzenie przepływu pracy Klienci do listy docelowej
Scenario: Creating the Customers to Target List Workflow

#//Użytkownik loguje się na swoje konto
Given The user logs into their account

#//Gdy użytkownik przejdzie do modułu "Przepływy pracy" poprzez ścieżkę: WSZYSTKIE -> Przepływy pracy
When the user navigates to the "Workflows" module through the path: ALL -> Workflows

#//I wybiera opcję "Nowy przepływ pracy"
And selects the "New workflow" option

#//Tworzy przepływ pracy o nazwie "Klienci do listy docelowej" i konfiguruje go zgodnie z dokumentacją.
And creates a workflow named "Customers to Target List" and configures it according to the documentation

#//Zapisuje i aktywuje ten przepływ pracy
And saves and activates this workflow

#//I przechodzi do modułu zawierającego klientów (Customers)
And navigates to the module containing customers

#//Wybiera jednego z klientów i przypisuje go do określonej listy docelowej (Target List).
And selects one of the customers and assigns them to a specific target list

#
#@verify
##//Weryfikacja działania przepływu pracy "Klienci do listy docelowej
#Scenario: Verifying the Operation of the Customers to Target List Workflow
#
##//Gdy użytkownik przejdzie do modułu "Workflows"
#When the user goes to the "Workflows" module
#
##//Znajduje i otwiera przepływ pracy "Klienci do listy docelowej".
#And finds and opens the "Customers to Target List" workflow
#
##//Sprawdza ustawienia przepływu pracy, w szczególności reguły i akcje
#And checks the workflow settings, especially rules and actions
#
##//I przechodzi do modułu z klientami (Customers)
#And goes to the module with customers
#
##//I wybiera klienta, który spełnia warunki przepływu pracy.
#And selects a customer who meets the workflow conditions

