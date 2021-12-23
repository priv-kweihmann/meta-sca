SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"

IMAGE_INSTALL += "\
                    bad-nginx \
                    bad-systemd \
                    openssh \
                    sudo \
                "

inherit core-image
inherit sca

add_fake_secret() {
    echo "AKIAI44QH8DHBEXAMPLE" > ${IMAGE_ROOTFS}/${sysconfdir}/fake_aws_token
}

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"
ROOTFS_POSTPROCESS_COMMAND += "add_fake_secret;"

do_devshell[depends] += "${PN}:do_rootfs"
