SUMMARY = "NPM: cspell-dict-powershell"
DESCRIPTION = "PowerShell Keyword Dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/powershell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-powershell/-/cspell-dict-powershell-1.1.5.tgz"
SRC_URI[md5sum] = "7e57646ceb211d56bcfb8de4c98f903c"
SRC_URI[sha256sum] = "56f8f58f5f71b40772f2c06b1c2af2046fdea9700c91713113862b88f5a08569"

NPM_PKGNAME = "cspell-dict-powershell"

inherit npmhelper
inherit native
