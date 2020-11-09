SUMMARY = "NPM: cspell-dict-powershell"
DESCRIPTION = "PowerShell Keyword Dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/powershell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-powershell/-/cspell-dict-powershell-1.0.10.tgz"
SRC_URI[md5sum] = "576924f2b700f4be14db5bd9190f9faf"
SRC_URI[sha256sum] = "52c470ce4020b084b786eb9d07c42a6e19df68ae5f78389dcb2e01435a4584fd"

NPM_PKGNAME = "cspell-dict-powershell"

inherit npmhelper
inherit native
