SUMMARY = "Static code analyzer for shell-scripts"
HOMEPAGE = "https://www.shellcheck.net/"
BUGTRACKER = "https://github.com/koalaman/shellcheck/issues"

COMPATIBLE_HOST = "^x86_64-linux|^aarch64-linux|^arm-linux"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4961609c03284904eb67ff03e2a87042"

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

SRC_URI[blob_x86_64.sha256sum] = "ab6ee1b178f014d1b86d1e24da20d1139656c8b0ed34d2867fbb834dad02bf0a"
SRC_URI[blob_aarch64.sha256sum] = "9f47bbff5624babfa712eb9d64ece14c6c46327122d0c54983f627ae3a30a4ac"
SRC_URI[blob_armv6hf.sha256sum] = "17857c8a0a8f4001aa9638732991cbb6e85c4a410500b11e2e0a98d9858afca8"

S = "${WORKDIR}/shellcheck-v${PV}"

do_patch[noexec] = "1"
do_configure[noexec] = "1"
do_compile[noexec] = "1"

inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "shellcheck"

do_install() {
    install -d ${D}${bindir}
    cp -R ${S}/shellcheck ${D}${bindir}

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

FILES:${PN} = "${bindir}"

UPSTREAM_CHECK_URI = "https://github.com/koalaman/shellcheck/tags"
UPSTREAM_CHECK_REGEX = "releases/tag/v(?P<pver>\d+\.\d+\.\d+)"

## We know it's already stripped - because we're using prebuild things
INSANE_SKIP:${PN} += "already-stripped arch"
