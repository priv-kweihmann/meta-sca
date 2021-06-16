SUMMARY = "NPM: cspell-dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/dotnet#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-dotnet/-/cspell-dict-dotnet-1.1.5.tgz"
SRC_URI[md5sum] = "1dcbe7ade32ee0ccf858c4c1405a00db"
SRC_URI[sha256sum] = "6c69c3457430151f1545057396bbdd1cb32dcbbe5cc58fa5f87ebef6cfd42710"

NPM_PKGNAME = "cspell-dict-dotnet"

inherit npmhelper
inherit native
