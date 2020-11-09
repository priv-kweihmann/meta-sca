SUMMARY = "NPM: cspell-dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/dotnet#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-dotnet/-/cspell-dict-dotnet-1.0.20.tgz"
SRC_URI[md5sum] = "9e8e8eacb05ab65372f1438328e453a1"
SRC_URI[sha256sum] = "7a3640777355f020f99c5ff510fc57636b279233c7a77506e1ca9ee00c37f85e"

NPM_PKGNAME = "cspell-dict-dotnet"

inherit npmhelper
inherit native
