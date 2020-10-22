SUMMARY = "NPM: cspell-dict-powershell"
DESCRIPTION = "PowerShell Keyword Dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/powershell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-powershell/-/cspell-dict-powershell-1.0.8.tgz"
SRC_URI[md5sum] = "37686e76fa598d6f55b49e5fab6183f8"
SRC_URI[sha256sum] = "621730749753fd0e085255b24f494d3143bada9bf96277b5ba15fe1d3d10b540"

NPM_PKGNAME = "cspell-dict-powershell"

inherit npmhelper
inherit native
