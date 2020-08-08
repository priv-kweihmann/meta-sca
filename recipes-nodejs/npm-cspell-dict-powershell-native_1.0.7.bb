SUMMARY = "NPM: cspell-dict-powershell"
DESCRIPTION = "PowerShell Keyword Dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/powershell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-powershell/-/cspell-dict-powershell-1.0.7.tgz"
SRC_URI[md5sum] = "4968c5571bbe79e6efe85ad2f084ab60"
SRC_URI[sha256sum] = "39d0c1d74bd6efc7b0c0159eb7a289697e18bd8a42f4a8fd68debb608397ff7a"

NPM_PKGNAME = "cspell-dict-powershell"

inherit npmhelper
inherit native
