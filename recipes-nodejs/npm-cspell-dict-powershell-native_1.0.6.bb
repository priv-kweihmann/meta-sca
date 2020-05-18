SUMMARY = "NPM: cspell-dict-powershell"
DESCRIPTION = "PowerShell Keyword Dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/powershell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-powershell/-/cspell-dict-powershell-1.0.6.tgz"
SRC_URI[md5sum] = "886d8e50766f639307e9adc0b0853c9a"
SRC_URI[sha256sum] = "0039a1ecb23bedb01cdefa631c3f067cfad8bbef5c6402e1feea89017228eeb6"

NPM_PKGNAME = "cspell-dict-powershell"

inherit npmhelper
inherit native
