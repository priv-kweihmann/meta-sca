SUMMARY = "NPM: cspell-dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/dotnet#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-dotnet/-/cspell-dict-dotnet-1.0.23.tgz"
SRC_URI[md5sum] = "ea2e87faf2e4a726a9ae8d5c1a612eb0"
SRC_URI[sha256sum] = "5dfd1a0d4320fcb0f2af442d8fe9d0224c1c9d172c9a9014e432d3c4b158305f"

NPM_PKGNAME = "cspell-dict-dotnet"

inherit npmhelper
inherit native
