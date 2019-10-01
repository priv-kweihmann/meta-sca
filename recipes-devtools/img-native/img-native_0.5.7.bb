SUMMARY = "Standalone, daemon-less, unprivileged Dockerfile and OCI compatible container image builder"

require ${@'img-native_arch_%s.inc' % d.getVar('BUILD_ARCH')}
SRC_URI += "https://raw.githubusercontent.com/genuinetools/img/v${PV}/LICENSE;name=lic"

SRC_URI[lic.md5sum] = "48ef0979a2bcc3fae14ff30b8a7f5dbf"
SRC_URI[lic.sha256sum] = "c696614021eafe355c7fb0af3e724fc7fa8729a0c10c27cbed2505bf30a853ce"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=48ef0979a2bcc3fae14ff30b8a7f5dbf"

inherit native

DEPENDS += "shadow-native"
 
FILES_${PN} = "${bindir}"
## We know it's already stripped - because we're using prebuild things
INSANE_SKIP_${PN} += "already-stripped file-rdeps arch"

do_install() {
    if [ $(cat /proc/sys/kernel/unprivileged_userns_clone) -ne "1" ]; then
        bbfatal "On your system you need to run 'echo 1 > /proc/sys/kernel/unprivileged_userns_clone' to make use of img-tool\n \
                 See https://github.com/genuinetools/img/issues/148 for details"
    fi
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/img-linux-* ${D}${bindir}/img-native
}
