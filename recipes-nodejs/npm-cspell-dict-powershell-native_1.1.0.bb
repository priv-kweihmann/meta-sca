SUMMARY = "NPM: cspell-dict-powershell"
DESCRIPTION = "PowerShell Keyword Dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/powershell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-powershell/-/cspell-dict-powershell-1.1.0.tgz"
SRC_URI[md5sum] = "097b482116d0bc78b56f8b875c9f226d"
SRC_URI[sha256sum] = "3ec02dbe775516bd4e3b8c409b48a2bfeeb027dc9b947e9eda3e09f900477d99"

NPM_PKGNAME = "cspell-dict-powershell"

inherit npmhelper
inherit native
