SUMMARY = "NPM: @cspell/dict-java"
DESCRIPTION = "Java dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/java#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-java/-/dict-java-2.0.0.tgz"
SRC_URI[md5sum] = "f0054cddc3bd60e398a814c399efbd2e"
SRC_URI[sha256sum] = "50303ab22536d54cdbbb1121fa56d7b4f9036ca653ca5913aa1dc287acb86c41"

NPM_PKGNAME = "@cspell/dict-java"

inherit npmhelper
inherit native
