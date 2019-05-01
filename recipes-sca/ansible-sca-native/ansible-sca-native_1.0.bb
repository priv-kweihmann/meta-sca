SUMMARY = "Ansible playbooks"

SRC_URI = "file://ansible.sca.description \
           file://etc_security.yaml \
           file://cron_security.yaml \
           file://modprobe.yaml \
           file://passwd_security.yaml \
           file://sshd.yaml \
           file://sysconf_net.yaml \
           file://sysconf.yaml \
           "

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

inherit native

B = "${WORKDIR}"

DEPENDS += "python-ansible-native"

FILES_${PN} = "${datadir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    mkdir -p ${D}${datadir}/ansible_sec
    for item in $(find ${B} -name "*.yaml"); do
        install -m 0644 ${item} ${D}${datadir}/ansible_sec/$(basename ${item})
    done
    install ${WORKDIR}/ansible.sca.description ${D}${datadir}/
}

