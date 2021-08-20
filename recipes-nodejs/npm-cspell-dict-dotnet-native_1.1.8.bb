SUMMARY = "NPM: cspell-dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/dotnet#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-dotnet/-/cspell-dict-dotnet-1.1.8.tgz"
SRC_URI[md5sum] = "6bfee8fb0b78b07b27d0e1507e109d94"
SRC_URI[sha256sum] = "f2edce8f6c86e2779510b5601005d36b1fdc6cc52189c6fb0455a05aac28f60b"

NPM_PKGNAME = "cspell-dict-dotnet"

inherit npmhelper
inherit native
