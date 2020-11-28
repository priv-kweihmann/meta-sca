SUMMARY = "NPM: cspell-dict-csharp"
DESCRIPTION = "C# dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/csharp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-csharp/-/cspell-dict-csharp-1.0.9.tgz"
SRC_URI[md5sum] = "5c3e90ff16119853a9c7178e74d82e79"
SRC_URI[sha256sum] = "d52e60e45cd984c85d78bf7fc66922184d62291d6348873e401958c4e05c6ef9"

NPM_PKGNAME = "cspell-dict-csharp"

inherit npmhelper
inherit native
