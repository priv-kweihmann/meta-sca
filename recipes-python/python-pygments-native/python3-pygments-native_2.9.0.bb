SUMMARY = "Pygments is a syntax highlighting package written in Python"
HOMEPAGE = "http://pygments.org/"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=98419e351433ac106a24e3ad435930bc"

PYPI_PACKAGE = "Pygments"

SRC_URI[md5sum] = "665516d1d1c0099241ab6e4c057e26be"
SRC_URI[sha256sum] = "a18f47b506a429f6f4b9df81bb02beab9ca21d0a5fee38ed15aef65f0545519f"

inherit pypi
inherit setuptools3
inherit native
