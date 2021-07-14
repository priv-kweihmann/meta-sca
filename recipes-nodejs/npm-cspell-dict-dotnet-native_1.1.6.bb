SUMMARY = "NPM: cspell-dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/dotnet#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-dotnet/-/cspell-dict-dotnet-1.1.6.tgz"
SRC_URI[md5sum] = "da81c3030c7c00c7abe52cb225ca3a19"
SRC_URI[sha256sum] = "99750bab236b392442816a5953a218df19adea82130dd3fc719cc816f8240837"

NPM_PKGNAME = "cspell-dict-dotnet"

inherit npmhelper
inherit native
