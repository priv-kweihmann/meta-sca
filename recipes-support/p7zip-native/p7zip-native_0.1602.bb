# This file is a modified version of files to be found at
# https://git.openembedded.org/meta-openembedded/plain/meta-oe/recipes-extended/p7zip/
#
# The recipe and the provided patches are licensed under the following terms
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:

# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.

# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
# THE SOFTWARE.
#
# this purely acts as a fallback for when no meta-openembeded is present
# and oh boi I wish the DYNAMIC_LAYER backfill option would be available in more
# branches, so one wouldn't have to come up with those nasty hacks :-(

SUMMARY = "7-zip is a commandline utility handling 7z archives."
HOMEPAGE = "http://www.7-zip.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.1-or-later & unRAR"
LIC_FILES_CHKSUM = "file://DOC/copying.txt;md5=4fbd65380cdd255951079008b364516c \
                    file://DOC/unRarLicense.txt;md5=9c87ddde469ef94aed153b0951d088de \
                    file://DOC/License.txt;md5=879598edf1f54dddb6930d7581357f8b"

SRC_URI = "http://downloads.sourceforge.net/p7zip/p7zip/16.02/p7zip_16.02_src_all.tar.bz2 \
           file://do_not_override_compiler_and_do_not_strip.patch \
           file://CVE-2017-17969.patch \
           file://0001-Fix-narrowing-errors-Wc-11-narrowing.patch \
           "

SRC_URI[md5sum] = "a0128d661cfe7cc8c121e73519c54fbf"
SRC_URI[sha256sum] = "5eb20ac0e2944f6cb9c2d51dd6c4518941c185347d4089ea89087ffdd6e2341f"

S = "${WORKDIR}/${BPN}_16.02"

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/bin/* ${D}${bindir}
	ln -s 7za ${D}${bindir}/7z
}

inherit native
