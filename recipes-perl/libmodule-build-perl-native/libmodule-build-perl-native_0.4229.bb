# This file is a patched version of the original from poky:zeus branch
# and is licensed under the following terms
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


SUMMARY = "Module::Build - Build and install Perl modules"
HOMEPAGE = "https://metacpan.org/release/Module-Build"

LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;beginline=949;endline=954;md5=624c06db56a2af4d70cf9edc29fcae1b"

SRC_URI = "${CPAN_MIRROR}/authors/id/L/LE/LEONT/Module-Build-${PV}.tar.gz"
SRC_URI[md5sum] = "1447d9e02e63f7a1643986789a8f1ba9"
SRC_URI[sha256sum] = "1fe491a6cda914b01bc8e592faa2b5404e9f35915ca15322f8f2a8d8f9008c18"

S = "${WORKDIR}/Module-Build-${PV}"

inherit cpan_build
inherit native

# From:
# https://github.com/rehsack/meta-cpan/blob/master/recipes-devel/module-build-perl/module-build-perl_0.4216.bb
#
do_patch_module_build () {
    cd ${S}
    sed -i -e 's,my $interpreter = $self->{properties}{perl};,my $interpreter = "${bindir}/perl";,g' lib/Module/Build/Base.pm
}

do_patch[postfuncs] += "do_patch_module_build"

RDEPENDS_${PN} += " \
    perl-module-carp \
    perl-module-cpan \
    perl-module-config \
    perl-module-cwd \
    perl-module-data-dumper \
    perl-module-encode \
    perl-module-extutils-cbuilder \
    perl-module-extutils-command \
    perl-module-extutils-install \
    perl-module-extutils-installed \
    perl-module-extutils-mkbootstrap \
    perl-module-extutils-packlist \
    perl-module-extutils-parsexs \
    perl-module-file-basename \
    perl-module-file-compare \
    perl-module-file-copy \
    perl-module-file-find \
    perl-module-file-glob \
    perl-module-file-path \
    perl-module-file-spec \
    perl-module-file-spec-functions \
    perl-module-getopt-long \
    perl-module-metadata \
    perl-module-perl-ostype \
    perl-module-pod-man \
    perl-module-tap-harness \
    perl-module-text-abbrev \
    perl-module-text-parsewords \
    perl-module-utf8 \
"

RPROVIDES_${PN} += "\
    libmodule-build-base-perl \
    libmodule-build-compat-perl \
    libmodule-build-config-perl \
    libmodule-build-cookbook-perl \
    libmodule-build-dumper-perl \
    libmodule-build-notes-perl \
    libmodule-build-ppmaker-perl \
    libmodule-build-platform-default-perl \
    libmodule-build-platform-unix-perl \
    libmodule-build-podparser-perl \
"
