SUMMARY = "NPM: lines-and-columns"
DESCRIPTION = "Maps lines and columns to character offsets and back."
HOMEPAGE = "https://github.com/eventualbuddha/lines-and-columns#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ccca5bd3aeb53dd27037cf30f01b379f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lines-and-columns/-/lines-and-columns-2.0.2.tgz"
SRC_URI[md5sum] = "84da707043931643cec0ea0c35bb7d1e"
SRC_URI[sha256sum] = "4df395930eb55eee37bb90048478b6df5776e458d9d3b98fb85729f5c1269aa6"

NPM_PKGNAME = "lines-and-columns"

inherit npmhelper
inherit native
