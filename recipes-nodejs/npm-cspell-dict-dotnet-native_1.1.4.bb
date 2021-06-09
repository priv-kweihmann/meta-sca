SUMMARY = "NPM: cspell-dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/dotnet#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-dotnet/-/cspell-dict-dotnet-1.1.4.tgz"
SRC_URI[md5sum] = "94790c49f1ff50f10beda784acffb2e6"
SRC_URI[sha256sum] = "ccdc5559fc1f34e2185c7ec7ec264c3da8db01098599b21d1fc7b82ce18795c0"

NPM_PKGNAME = "cspell-dict-dotnet"

inherit npmhelper
inherit native
