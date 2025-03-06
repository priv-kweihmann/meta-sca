SUMMARY = "library that makes it easy to scrape information from web pages"
HOMEPAGE = "http://www.crummy.com/software/BeautifulSoup/bs4/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96e0034f7c9443910c486773aa1ed9ac"

DEPENDS += "python3-soupsieve-native"

PYPI_PACKAGE = "beautifulsoup4"

SRC_URI[md5sum] = "63b9e66839aa5e67701c76455d3be92a"
SRC_URI[sha256sum] = "1bd32405dacc920b42b83ba01644747ed77456a65760e285fbc47633ceddaf8b"

inherit pypi
inherit python_hatchling
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-soupsieve"
