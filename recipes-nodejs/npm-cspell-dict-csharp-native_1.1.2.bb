SUMMARY = "NPM: cspell-dict-csharp"
DESCRIPTION = "C# dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/csharp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-csharp/-/cspell-dict-csharp-1.1.2.tgz"
SRC_URI[md5sum] = "8c792ffbb0f46a0d63b0002ecfbb7883"
SRC_URI[sha256sum] = "a8955e36274dbd98a334564ae06ceb2eb1dd5fe552ca31a798cdb0d6fb003d66"

NPM_PKGNAME = "cspell-dict-csharp"

inherit npmhelper
inherit native
