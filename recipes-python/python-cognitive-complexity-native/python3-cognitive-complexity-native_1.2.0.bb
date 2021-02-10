SUMMARY = "Library to calculate Python functions cognitive complexity via code"
HOMEPAGE = "https://github.com/Melevir/cognitive_complexity"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/${PN}-LICENSE;md5=535dcde9d395e0ffc8bea1b3e738bed0"

PYPI_PACKAGE = "cognitive_complexity"

SRC_URI_append = " https://raw.githubusercontent.com/Melevir/cognitive_complexity/master/LICENSE;name=license;downloadfilename=${PN}-LICENSE"

SRC_URI[md5sum] = "637d3616db0d617396b1490040930905"
SRC_URI[sha256sum] = "3c2b433a9e41502932f6aa629e1f57a5e8f145956c54facbb5241a9492af6fb7"
SRC_URI[license.md5sum] = "535dcde9d395e0ffc8bea1b3e738bed0"
SRC_URI[license.sha256sum] = "606ac64848bc8293ed15cb9195dab80b75907c5826156c2139fe8f9df37db1fc"

UPSTREAM_CHECK_REGEX ?= "/cognitive-complexity/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit native
