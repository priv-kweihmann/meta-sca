SUMMARY = "NPM: cspell-dict-powershell"
DESCRIPTION = "PowerShell Keyword Dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/powershell#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-powershell/-/cspell-dict-powershell-1.1.6.tgz"
SRC_URI[md5sum] = "24c2382bef80dc1d5695f1baef94cfb5"
SRC_URI[sha256sum] = "bb29dc1a7053c83a27c14d48a5ce44d17a6969e56213a636b0b02c55b0e326b7"

NPM_PKGNAME = "cspell-dict-powershell"

inherit npmhelper
inherit native
