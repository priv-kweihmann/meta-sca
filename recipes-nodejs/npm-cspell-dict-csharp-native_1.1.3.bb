SUMMARY = "NPM: cspell-dict-csharp"
DESCRIPTION = "C# dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/csharp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-csharp/-/cspell-dict-csharp-1.1.3.tgz"
SRC_URI[md5sum] = "8e8e2042a6cda7ad06ca537f596ca707"
SRC_URI[sha256sum] = "0a1395bad277fe187d2569a220477637c6a1422ee95dae8ffe9dd110e68ab812"

NPM_PKGNAME = "cspell-dict-csharp"

inherit npmhelper
inherit native
