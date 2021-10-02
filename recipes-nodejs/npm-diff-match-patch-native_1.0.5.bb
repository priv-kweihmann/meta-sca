SUMMARY = "NPM: diff-match-patch"
DESCRIPTION = "npm package for https://github.com/google/diff-match-patch"
HOMEPAGE = "https://github.com/JackuB/diff-match-patch#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/diff-match-patch/-/diff-match-patch-1.0.5.tgz"
SRC_URI[md5sum] = "23b6757c23a3933904b52e00fe14a803"
SRC_URI[sha256sum] = "ea56d44af647249ce8c1120464f48f66bbb206820e06903d915b3bfb29bc65ab"

NPM_PKGNAME = "diff-match-patch"

inherit npmhelper
inherit native
