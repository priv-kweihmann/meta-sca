SUMMARY = "RubyGem: aws-sdk-efs"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic File System (EFS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "0c9ac06888b3de56e3d6ed51f49b86d4"
SRC_URI[sha256sum] = "7ed5952367e7fe075104cd456c12088e27e0eeb6868fdf4916e7f869c3036e0d"

GEM_NAME = "aws-sdk-efs"

inherit rubygems
