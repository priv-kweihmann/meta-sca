SUMMARY = "NPM: is-accessor-descriptor"
DESCRIPTION = "Returns true if a value has the characteristics of a valid JavaScript accessor descriptor."
HOMEPAGE = "https://github.com/jonschlinkert/is-accessor-descriptor"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b561e0a423bedc9d9ca9c8c67d40abb9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-accessor-descriptor/-/is-accessor-descriptor-3.0.1.tgz"
SRC_URI[md5sum] = "f83859974f05fee170c2d4a2ebfe8d19"
SRC_URI[sha256sum] = "4c7eaf31429801997224902c256cecf0bf79143f772fb2adff8373662dc21115"

NPM_PKGNAME = "is-accessor-descriptor"

inherit npmhelper
inherit native
