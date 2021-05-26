SUMMARY = "NPM: cspell-dict-powershell"
DESCRIPTION = "PowerShell Keyword Dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/powershell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-powershell/-/cspell-dict-powershell-1.1.3.tgz"
SRC_URI[md5sum] = "48f5e67df6db6eb23ff3a368d55dd6d2"
SRC_URI[sha256sum] = "1f55b2baa1d6d200d3ced65603b2735d4854db5147669b6afd2caade463e0792"

NPM_PKGNAME = "cspell-dict-powershell"

inherit npmhelper
inherit native
