SUMMARY = "NPM: @cspell/dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/dotnet#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-dotnet/-/dict-dotnet-2.0.0.tgz"
SRC_URI[md5sum] = "c1f35daf479ee4e9c172634d17435456"
SRC_URI[sha256sum] = "c44083c567e9256527880c70cef02a83368179b08e33f177532adc6386865cdf"

NPM_PKGNAME = "@cspell/dict-dotnet"

inherit npmhelper
inherit native
