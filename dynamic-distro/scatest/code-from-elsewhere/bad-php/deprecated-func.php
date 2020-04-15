<?php
class foofoo {
    function foo() {
        echo 'I am the constructor';
    }
}

class foo {
    function bar() {
        echo 'I am not static!';
    }
}

foo::bar();

/**
 * We just want to hash our password using the current DEFAULT algorithm.
 * This is presently BCRYPT, and will produce a 60 character result.
 *
 * Beware that DEFAULT may change over time, so you would want to prepare
 * By allowing your storage to expand past 60 characters (255 would be good)
 */
$foo = password_hash("rasmuslerdorf", "sjkdkhsdashsjkdhdk");

// $ds ist eine gültige Verbindungskennung (siehe ldap_connect)

$dn        = 'ou=example,dc=org';
$filter    = '(|(sn=Doe*)(givenname=John*))';
$justthese = array('ou', 'sn', 'givenname', 'mail');

$sr = ldap_search($ds, $dn, $filter, $justthese);

// Sortiere
ldap_sort($ds, $sr, 'sn');

// Hole die Daten
$info = ldap_get_entries($ds, $sr);
?>
