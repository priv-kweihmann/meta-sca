SUMMARY = "NPM: @cspell/dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/dotnet#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-dotnet/-/dict-dotnet-2.0.1.tgz"
SRC_URI[md5sum] = "6785aee9ed0bdc5f00ff3182a53e4382"
SRC_URI[sha256sum] = "3caf4d415c0911a32d23129c43edf988633165800b1b78fb8ac677018a650248"

NPM_PKGNAME = "@cspell/dict-dotnet"

inherit npmhelper
inherit native
