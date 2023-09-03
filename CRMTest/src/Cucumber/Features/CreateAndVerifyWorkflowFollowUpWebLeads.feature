#@FollowUpWebTargetList
##  Twórzenie i weryfikacja przepływ pracy Follow Up Web Target List
#Feature: Create and verify workflow Follow Up Web target List
#
#@create
## Tworzenie przepływu pracy Follow Up Web Leads
#Scenario: Creating the Follow Up Web Leads Workflow
#
##  Użytkownik loguje się na swoje konto
#Given The user logs into their account
#
##  Gdy użytkownik przejdzie do modułu "Przepływy pracy"
#When the user goes to the "Workflows" module
#
##  I tworzy nowy przepływ pracy o nazwie "Follow Up Web Leads" i
##konfiguruje go zgodnie z dokumentacją
#And creates a new workflow named "Follow Up Web Leads" and configures it according to the documentation
#
##  Zapisuje i aktywuje ten przepływ pracy
#And saves and activates this workflow
#
#
#@verify
## Weryfikacja działania przepływu pracy "Follow Up Web Leads
#Scenario: Verifying the Operation of the Follow Up Web Leads Workflow
#
##  Gdy użytkownik przejdzie do modułu "Workflows"
#When the user goes to the "Workflows" module
#
##  Znajduje i otwiera przepływ pracy "Follow Up Web Leads".
#And finds and opens the "Follow Up Web Leads" workflow
#
##  Sprawdza ustawienia przepływu pracy, w szczególności reguły i działania związane z potencjalnymi klientami.
#And checks the workflow settings, especially rules and actions related to web leads
#
##  I przechodzi do modułu z leadami internetowymi (Web Leads) lub generuje testowy lead internetowy.
#And goes to the module with web leads (Web Leads) or generates a test web lead
#
