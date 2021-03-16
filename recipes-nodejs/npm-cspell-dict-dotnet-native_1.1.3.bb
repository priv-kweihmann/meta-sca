SUMMARY = "NPM: cspell-dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/dotnet#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-dotnet/-/cspell-dict-dotnet-1.1.3.tgz"
SRC_URI[md5sum] = "abf17d74985f5e770c684577b5b7d2ec"
SRC_URI[sha256sum] = "85c8153f90339bc5594132cd77b63853f657ec2b4049a19ea37ef20ce7bb449e"

NPM_PKGNAME = "cspell-dict-dotnet"

inherit npmhelper
inherit native
