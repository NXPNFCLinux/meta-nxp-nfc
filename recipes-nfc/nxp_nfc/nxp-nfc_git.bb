# Copyright (C) 2016 NXP Semiconductors

DESCRIPTION = "Linux NFC stack for NCI based NXP NFC Controllers."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/include/linux_nfc_api.h;md5=3a0d875da69c6803615751691be0f0e7"

SRC_URI = " \
    git://github.com/NXPNFCLinux/linux_libnfc-nci.git;branch=master \
    file://0001-Add-.gitignore.patch \
"
SRCREV = "751f7bfa9f3f5b43e8a179d0a80dabd6bc1dac17"

inherit autotools pkgconfig lib_package

S = "${WORKDIR}/git"

# RDEPENDS on nxp-pn5xx kernel module
RDEPENDS_${PN} = "kernel-module-nxp-pn5xx"

