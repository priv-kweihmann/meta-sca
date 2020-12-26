SUMMARY = "NPM: cspell-dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/dotnet#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-dotnet/-/cspell-dict-dotnet-1.1.2.tgz"
SRC_URI[md5sum] = "621cca49db50f226d77a28da424f87af"
SRC_URI[sha256sum] = "bee56fd2737e269af31a6c0c118c9a0425d7fda9be0142e513de131cb7c052bb"

NPM_PKGNAME = "cspell-dict-dotnet"

inherit npmhelper
inherit native
