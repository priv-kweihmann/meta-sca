SUMMARY = "NPM: cspell-dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/dotnet#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-dotnet/-/cspell-dict-dotnet-1.0.15.tgz"
SRC_URI[md5sum] = "1bf04da2002cce067265ee9ef78d0656"
SRC_URI[sha256sum] = "bce52d8b3a09185b9e03e93b62b2f6d4811e0478268bba92c05cdefa90e51210"

NPM_PKGNAME = "cspell-dict-dotnet"

inherit npmhelper
inherit native
