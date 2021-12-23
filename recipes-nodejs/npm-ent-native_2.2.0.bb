SUMMARY = "NPM: ent"
DESCRIPTION = "Encode and decode HTML entities"
HOMEPAGE = "https://github.com/substack/node-ent"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1"

SRC_URI = "https://registry.npmjs.org/ent/-/ent-2.2.0.tgz"
SRC_URI[md5sum] = "5b5222681974dca8fe79f6436a0a058d"
SRC_URI[sha256sum] = "9676ecdffd2aefe5593a20d7c95e6c23c997f4f32094751e68e96f4c93b39418"

NPM_PKGNAME = "ent"

inherit npmhelper
inherit native
