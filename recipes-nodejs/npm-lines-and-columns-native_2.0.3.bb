SUMMARY = "NPM: lines-and-columns"
DESCRIPTION = "Maps lines and columns to character offsets and back."
HOMEPAGE = "https://github.com/eventualbuddha/lines-and-columns#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ccca5bd3aeb53dd27037cf30f01b379f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lines-and-columns/-/lines-and-columns-2.0.3.tgz"
SRC_URI[md5sum] = "b8fcd5fb8025d18bd9a2d1eb9c21bd65"
SRC_URI[sha256sum] = "3420bbaec741b92888f61bec1f837524f73dffe0314d2dd94bedc62164c8e1a7"

NPM_PKGNAME = "lines-and-columns"

inherit npmhelper
inherit native
