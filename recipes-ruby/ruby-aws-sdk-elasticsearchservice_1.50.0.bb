SUMMARY = "RubyGem: aws-sdk-elasticsearchservice"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elasticsearch Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "eb8b19bb7759e8d95efce4df76811fdd"
SRC_URI[sha256sum] = "8ac5c931d493ff7212c4622c32e65f480c959f1af73b07dbb58a70e8770aa104"

GEM_NAME = "aws-sdk-elasticsearchservice"

inherit rubygems
