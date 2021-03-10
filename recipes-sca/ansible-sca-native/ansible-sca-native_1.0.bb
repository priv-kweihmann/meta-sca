SUMMARY = "Ansible playbooks"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "python3-ansible-native"

SRC_URI = "file://ansible.sca.description \
           file://etc_security.yaml;subdir=playbooks \
           file://cron_security.yaml;subdir=playbooks \
           file://modprobe.yaml;subdir=playbooks \
           file://passwd_security.yaml;subdir=playbooks \
           file://sshd.yaml;subdir=playbooks \
           file://sysconf_net.yaml;subdir=playbooks \
           file://sysconf.yaml;subdir=playbooks \
           "

inherit sca-description
inherit native

B = "${WORKDIR}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}/ansible_sec
    for item in $(find ${B}/playbooks -name "*.yaml"); do
        install -m 0644 ${item} ${D}${datadir}/ansible_sec/$(basename ${item})
    done
    install ${WORKDIR}/ansible.sca.description ${D}${datadir}/
}

FILES_${PN} = "${datadir}"
