SUMMARY = "NPM: lines-and-columns"
DESCRIPTION = "Maps lines and columns to character offsets and back."
HOMEPAGE = "https://github.com/eventualbuddha/lines-and-columns#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ccca5bd3aeb53dd27037cf30f01b379f"

SRC_URI = "https://registry.npmjs.org/lines-and-columns/-/lines-and-columns-1.1.6.tgz"
SRC_URI[md5sum] = "be695863ed46527bed1456f8ff7fd230"
SRC_URI[sha256sum] = "752025d01ee1b1aec9c92be71dd57feb725241539b5854c997e8383e630ee626"

NPM_PKGNAME = "lines-and-columns"

inherit npmhelper
inherit native
