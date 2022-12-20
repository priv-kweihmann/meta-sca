SUMMARY = "Natural Language Toolkit"
HOMEPAGE = "https://github.com/nltk/nltk"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d273d63619c9aeaf15cdaf76422c4f87"

DEPENDS += "\
             python3-click-native \
             python3-joblib-native \
             python3-regex-native \
             python3-tqdm-native \
           "

PYPI_PACKAGE = "nltk"
PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "04c3af8a3644ec274b8d5994f3122685"
SRC_URI[sha256sum] = "74b30826a37d78d53427105bbd037dd880251be269fca64ee530838a46ed55fc"

inherit pypi
inherit setuptools3
inherit native

do_install:append() {
  # delete pydoc reference
  find ${D} -type f -exec sed -i '/import pydoc/d' {} \;
}
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-click \
    nativesdk-python3-joblib \
    nativesdk-python3-regex \
    nativesdk-python3-tqdm \
"
