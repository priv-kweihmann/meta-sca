SUMMARY = "Static code analyzer for shell-scripts"
HOMEPAGE = "https://www.shellcheck.net/"
BUGTRACKER = "https://github.com/koalaman/shellcheck/issues"

COMPATIBLE_HOST = "^x86_64-linux|^aarch64-linux|^arm-linux"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e1bef773207728bc05e072ab8b7c1f9f"

DEPENDS += "\
    dpkg-native \
    gmp-native \
    libffi-native \
"

SHELLCHECK_MANUAL_ARCH ?= ""

def shellcheck_arch_map(d):
    _arch = d.getVar("SHELLCHECK_MANUAL_ARCH") or d.getVar("BUILD_ARCH")
    if _arch == "x86_64":
        return "x86_64"
    elif _arch == "aarch64":
        return "aarch64"
    elif _arch == "arm":
        return "armv6hf"

SRC_URI = "https://github.com/koalaman/shellcheck/releases/download/v${PV}/shellcheck-v${PV}.linux.${@shellcheck_arch_map(d)}.tar.xz;name=blob_${@shellcheck_arch_map(d)}"

SRC_URI[blob_x86_64.sha256sum] = "70423609f27b504d6c0c47e340f33652aea975e45f312324f2dbf91c95a3b188"
SRC_URI[blob_aarch64.sha256sum] = "a12bdfe0f95811ad6c0a091006b919b2834b0619b460cfa596f557edd62e45ab"
SRC_URI[blob_armv6hf.sha256sum] = "29c7291985ad391fc8af930ba89c7441d5764aa3415ef1d77171aea0b34d35b9"

SRC_URI_append = " file://shellcheck.sca.description"

S = "${WORKDIR}/shellcheck-v${PV}"

do_patch[noexec] = "1"
do_configure[noexec] = "1"
do_compile[noexec] = "1"

inherit sca-description
inherit native

do_install() {
    install -d ${D}${bindir}
    cp -R ${S}/shellcheck ${D}${bindir}
    install -d ${D}${datadir}
    install ${WORKDIR}/shellcheck.sca.description ${D}${datadir}

    # Add a wrapper script to fix the linking issues
    cat << EOF > ${D}${bindir}/shellcheck-wrapper
#!/bin/sh

if [ ! -e "${STAGING_LIBDIR_NATIVE}/libffi.so.7" -a -e "${STAGING_LIBDIR_NATIVE}/libffi.so.6" ]; then
   ln -s ${STAGING_LIBDIR_NATIVE}/libffi.so.6 ${STAGING_LIBDIR_NATIVE}/libffi.so.7
fi

LD_LIBRARY_PATH=${STAGING_LIBDIR_NATIVE} shellcheck \$@
EOF
    chmod 0755 ${D}${bindir}/shellcheck-wrapper
}

FILES_${PN} = "${bindir} ${datadir}"

UPSTREAM_CHECK_URI = "https://github.com/koalaman/shellcheck/tags"
UPSTREAM_CHECK_REGEX = "releases/tag/v(?P<pver>\d+\.\d+\.\d+)"

## We know it's already stripped - because we're using prebuild things
INSANE_SKIP_${PN} += "already-stripped arch"
