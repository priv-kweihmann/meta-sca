SUMMARY = "RubyGem: diff-lcs"
DESCRIPTION = "Diff::LCS computes the difference between two Enumerable sequences using theMcIlroy-Hunt longest common subsequence (LCS) algorithm"
HOMEPAGE = "https://github.com/halostatue/diff-lcs"

LICENSE = "MIT & Artistic-2.0 & GPL-2.0+"
LIC_FILES_CHKSUM = "file://License.md;md5=debd9dff6792a920e1ca0ee909e1926a"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "62ee6015ca28466dbb8dd02655257a7c"
SRC_URI[sha256sum] = "bf3a658875f70c1467fe7a3b302b795f074c84b28db6e4a2bd6b1ad6d12a2255"

GEM_NAME = "diff-lcs"

inherit rubygems
