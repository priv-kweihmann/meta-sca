SUMMARY = "NPM: cspell-dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/dotnet#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-dotnet/-/cspell-dict-dotnet-1.1.9.tgz"
SRC_URI[md5sum] = "1f99e09c283cb6fe5d03d56c20bb78cb"
SRC_URI[sha256sum] = "b0b1f1c17d9f443a862c3272793ebfd26d765bd87efb2cddad7173f6fd854d99"

NPM_PKGNAME = "cspell-dict-dotnet"

inherit npmhelper
inherit native
