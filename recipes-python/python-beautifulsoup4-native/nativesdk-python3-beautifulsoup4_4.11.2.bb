SUMMARY = "library that makes it easy to scrape information from web pages"
HOMEPAGE = "http://www.crummy.com/software/BeautifulSoup/bs4/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96e0034f7c9443910c486773aa1ed9ac"

DEPENDS += "nativesdk-python3-soupsieve"

PYPI_PACKAGE = "beautifulsoup4"

SRC_URI[md5sum] = "5f235c26c86084c2696b1333264ed566"
SRC_URI[sha256sum] = "bc4bdda6717de5a2987436fb8d72f45dc90dd856bdfd512a1314ce90349a0106"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-soupsieve"
