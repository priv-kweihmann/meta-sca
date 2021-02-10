SUMMARY = "unicodecsv is a drop-in replacement for Python 2.7’s csv module"
HOMEPAGE = "https://github.com/jdunck/python-unicodecsv"

LICENSE = "BSD-2-Clause"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=cb641bc04cda31daea161b1bc15da69f"

PYPI_PACKAGE = "unicodecsv"

SRC_URI[md5sum] = "c18ffe8ded29a4f429224877b2b34252"
SRC_URI[sha256sum] = "018c08037d48649a0412063ff4eda26eaa81eff1546dbffa51fa5293276ff7fc"

inherit pypi
inherit setuptools3
inherit native
