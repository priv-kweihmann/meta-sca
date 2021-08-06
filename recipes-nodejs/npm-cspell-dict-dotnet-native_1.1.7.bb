SUMMARY = "NPM: cspell-dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/dotnet#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-dotnet/-/cspell-dict-dotnet-1.1.7.tgz"
SRC_URI[md5sum] = "36e2075ce7ccf545394a2dcc7acc9993"
SRC_URI[sha256sum] = "d961a3c55c69304a5296b903f20c5227d40fbea7218a64633031b7e0bc725d95"

NPM_PKGNAME = "cspell-dict-dotnet"

inherit npmhelper
inherit native
