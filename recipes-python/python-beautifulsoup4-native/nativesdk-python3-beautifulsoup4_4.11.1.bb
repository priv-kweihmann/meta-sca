SUMMARY = "library that makes it easy to scrape information from web pages"
HOMEPAGE = "http://www.crummy.com/software/BeautifulSoup/bs4/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=15a76c7c51ecfc5c094d04f3ccd41a09"

DEPENDS += "nativesdk-python3-soupsieve"

PYPI_PACKAGE = "beautifulsoup4"

SRC_URI[md5sum] = "22f22f89cf9da41b22e1ece9639c66a3"
SRC_URI[sha256sum] = "ad9aa55b65ef2808eb405f46cf74df7fcb7044d5cbc26487f96eb2ef2e436693"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-soupsieve"
