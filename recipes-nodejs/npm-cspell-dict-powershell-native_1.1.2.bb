SUMMARY = "NPM: cspell-dict-powershell"
DESCRIPTION = "PowerShell Keyword Dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/powershell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-powershell/-/cspell-dict-powershell-1.1.2.tgz"
SRC_URI[md5sum] = "710d9537830ee2e3ec502f0c79dcb15e"
SRC_URI[sha256sum] = "1003cddfc916618906540e977bc2e76350b7ce64eb6244f77f8d1fedeca0a559"

NPM_PKGNAME = "cspell-dict-powershell"

inherit npmhelper
inherit native
