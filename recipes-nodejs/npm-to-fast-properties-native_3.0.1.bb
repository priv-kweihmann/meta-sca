SUMMARY = "NPM: to-fast-properties"
DESCRIPTION = "Force V8 to use fast properties for an object"
HOMEPAGE = "https://github.com/sindresorhus/to-fast-properties#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=e45fa4fe9e865fa9c8d03c7630983122"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/to-fast-properties/-/to-fast-properties-3.0.1.tgz"
SRC_URI[md5sum] = "1e7e64ceb5c466bc39282a8cd218d010"
SRC_URI[sha256sum] = "46698c10aa7a83c21eba00d1dd0317ad989b2e48be26125c273aece07088c167"

NPM_PKGNAME = "to-fast-properties"

inherit npmhelper
inherit native
